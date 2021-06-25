package io.shulie.tro.monitor.util;

import java.io.IOException;

import io.fabric8.kubernetes.client.Config;
import io.fabric8.kubernetes.client.DefaultKubernetesClient;
import io.fabric8.kubernetes.client.KubernetesClient;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

/**
 * @author: HengYu
 * @Date 2020-05-12
 */
@Component
@Slf4j
public class K8sClient {

    @Value("${k8s.conf}")
    private Resource resource;

    /**
     * k8s client
     */
    private KubernetesClient client;

    /**
     * init k8s client
     * @return
     */
    private KubernetesClient initClient() {
        try {
            Config config = Config.fromKubeconfig(IOUtils.toString(resource.getInputStream()));
            config.setHttp2Disable(true);
            client = new DefaultKubernetesClient(config);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return client;
    }

    /**
     * get k8s client instance
     * @return
     */
    public KubernetesClient getKubernetesClient() {
        if (client == null) {
            synchronized (this) {
                return initClient();
            }
        }
        return client;
    }
}
