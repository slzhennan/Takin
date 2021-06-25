package io.shulie.tro.channel.router.zk;

import java.util.concurrent.Executor;

/**
 * 监视 ZooKeeper 节点的更新，并把内容缓存在内存中。
 * 创建方式：{@link ZkClient#createZkNodeCache(String, boolean)}
 * @author: HengYu
 */
public interface ZkNodeCache extends Lifecycle {

    /**
     * 获取缓存在内存中的数据
     *
     * @return
     */
    byte[] getData();


    /**
     * 获取监视的节点路径
     *
     * @return
     */
    String getPath();

    /**
     * 设置更新回调，回调会由 zk 线程执行，需要业务保证逻辑非常简短。
     *
     * @param runnable
     */
    void setUpdateListener(Runnable runnable);

    /**
     * 设置更新回调使用指定的 executor 执行。
     *
     * @param executor
     */
    void setUpdateExecutor(Executor executor);

    /**
     * 开始监视更新，第一次更新异步的方式进行，第一次更新会触发回调
     *
     * @throws Exception
     */
    @Override
    void start() throws Exception;

    /**
     * 开始监视更新，并完成第一次阻塞更新，第一次更新不会回调
     *
     * @throws Exception
     */
    void startAndRefresh() throws Exception;

    /**
     * 停止监视更新，回调会被清空
     */
    @Override
    void stop();

    /**
     * 手动刷新，不触发回调
     *
     * @throws Exception
     */
    void refresh() throws Exception;

    /**
     * 检查当前是否在运行状态
     * @return 运行状态
     *
     */
    @Override
    boolean isRunning();

    /**
     * 删除注册目录
     */
    void delete() throws Exception;
}
