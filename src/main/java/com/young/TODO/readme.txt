TODO 部分代码为一个使用Berkeley DB 构建爬虫队列示例
    Berkeley DB 存储是一个 key/value 的结构，并且 key 和 value 对象都要实现 Java序列化接口。因此，我们先来构建 value 对象，即一个封装了很多重要属性的 URL 类。

    Berkeley  DB  中存储的  e Value ：CrawlUrl.java
    TODO 表的接口：Frontier.java
    使用一个抽象类来封装对 Berkeley DB 的操作:AbstractFrontier.java
    实现真正的 TODO 表：BDBFrontier.java

以上就是一个使用 Berkeley DB 来实现 TODO表的完整示例。


需要导入的包为：
    <dependency>
      <groupId>org.apache.hadoop</groupId>
      <artifactId>hadoop-common</artifactId>
      <version>2.5.1</version>
    </dependency>
    <dependency>
      <groupId>org.apache.hadoop</groupId>
      <artifactId>hadoop-hdfs</artifactId>
      <version>2.5.1</version>
    </dependency>
    <dependency>
      <groupId>org.apache.hadoop</groupId>
      <artifactId>hadoop-client</artifactId>
      <version>2.5.1</version>
    </dependency>
    <!-- https://mvnrepository.com/artifact/com.sleepycat/je -->
    <dependency>
      <groupId>com.sleepycat</groupId>
      <artifactId>je</artifactId>
      <version>4.0.92</version>
    </dependency>