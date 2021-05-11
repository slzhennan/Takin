# DaYuX（大禹X）
[![LICENSE](https://img.shields.io/github/license/pingcap/tidb.svg)](https://github.com/pingcap/tidb/blob/master/LICENSE)
[![Language](https://img.shields.io/badge/Language-Java-blue.svg)](https://www.java.com/)

## What is DaYuX?
DaYuX is an Java-based open-source system designed to measure online performance and load test applications without affecting online data, Especially for microservices.

大禹X是一款基于Java的开源系统，在不污染现网数据的情况下，实现生产环境的性能测试，尤其是面向微服务架构系统。

# Why should we do online environmental performance test
Microservices Architecture is used commonly nowadays and it always make system complex to understand for humans. Moreover, businesses are also very complex in huge system. Business complexity and system complexity make it difficult to Keep entire system highly available and Maintain Research & Development efficiency.<br/> 
In order to keep system high availabile, we usually make performance test on test environment or online single-service. However, test environment is very different from online environment, single-service performance test can't stand for the whole service-links. They can't guarantee system performance.

**Microservices Are Complex**<br/>
Compare with monolithic application, Microservices architecture increases complexity for business system. It may maintain multiple tools and frameworks.

**Business Systems Are Complex**<br/>
Businesses involve different sections and many of them are long-process and complicated, such as E-Commerce businesses.

**The Microservices Relation Is Complex**<br/>
In a microservices architecture system with a lot of business services, the calling relation between services is very complicated. Every change may affect the availability of the entire system and make developers difficult to release new versions Frequently.

![Alt text](https://raw.githubusercontent.com/shulieTech/Images/main/WX20210511-150735%402x.png)

## 我们为什么需要做生产环境的性能测试？
微服务架构在现代系统架构中已被普遍使用，与此同时，随着业务的扩张和微服务数量的增加，它使系统变得非常复杂以至于人无法理解，而且，很多业务逻辑本身也非常复杂。业务复杂性和系统复杂性使保证和维持整个系统的高可用性非常困难，同时，它对研发效率也产生负面影响。<br/>
为了保证系统的高可用性，我们同行对测试环境或生产环境的单一服务进行性能测试，但是，测试环境与在生产环境区别很大，单个服务也不能代表整个服务链路，因此，他们都不能保证系统的高可用，通常也无法给出准确的容量评估结果。

**微服务很复杂**<br/>
和单体架构相比，微服务架构增加了业务系统的复杂性，因为它的子服务数量更多，并且涉及更多的不同技术栈和框架。

**业务系统也很复杂**<br/>
很多业务本身的业务逻辑也很复杂，其中很多业务涉及比较长的业务流程，例如电商业务。

**服务与服务之间的调用关系也很复杂**<br/>
在微服务架构的系统中，服务之间的调用关系非常复杂，每次服务的发布和更新都可能影响整个系统的可用性，并使开发人员难以频繁发布新版本。

# Quick Start Instruction


# Instruction
## Agent
see [Agent](https://github.com/shulieTech/DaYuX/blob/main/agent/README.md?_blank)

## Surge Data
see [Surge Data](https://github.com/shulieTech/DaYuX/blob/main/data/surge-data/README.md?_blank)

## Controlle Platform
see

# License
DaYuX is under the Apache 2.0 license. See the [LICENSE](https://github.com/shulieTech/DaYuX/blob/main/LICENSE?_blank) file for details.
