### 一、项目说明
本项目为jacoco demo项目，参考阔海老师代码库:https://gitee.com/shuhaihuang/cyber-range-jacoco?_from=gitee_searchx项目访问路径
http://localhost:8080/1?p1=1&p2=2&method=add

### 二、jacoco on-the-fly 模式实践步骤
>参考博客：https://www.cnblogs.com/edwar172038/p/11491267.html
- 2.1 启动项目，添加插桩代理
java -javaagent:/Users/xiaoyao62/Desktop/jacoco/jacoco-0.8.7/lib/jacocoagent.jar=includes=*,output=tcpserver,port=7703,address=localhost -jar ./target/jacoco-demo-v0.0.1.jar
- 2.2 浏览器访问项目提供的后端接口，产生dump记录
- 2.3 命令行方式获取dump数据
    cd /Users/xiaoyao62/github/jacoco-demo
    java -jar /Users/xiaoyao62/Desktop/jacoco/jacoco-0.8.7/lib/jacococli.jar dump --address localhost --port 7703 --destfile ./jacoco-demo.exec 
[INFO] Connecting to localhost/127.0.0.1:7703.
[INFO] Writing execution data to /Users/xiaoyao62/github/jacoco-demo/./jacoco-demo.exec.
查看项目根路径已生成了dump数据
- 2.4 获取覆盖率报告
    方式1:idea jacoco插件（未实践）
    方式2：maven插件
    方式3：命令行获取
    java -jar /Users/xiaoyao62/Desktop/jacoco/jacoco-0.8.7/lib/jacococli.jar report ./jacoco-demo.exec --classfiles /Users/xiaoyao62/github/jacoco-demo/target/classes/com --sourcefiles /Users/xiaoyao62/github/jacoco-demo/src/main/java/ --html report --xml report.xml
执行上面命令后，在项目根路径下产生了report目录，可以查看覆盖率报告

参数解析：
生成报告需要的三要素
1、编译后的classes文件，由于dump数据是基于classes文件记录的执行痕迹，报告当然需要classes做对比展示
2、源代码，显示源码代码行，用于染色
3、dump记录的执行记录，用于染色
　　--classfiles 必须项,是编译后target 文件夹下的classes里面的com
   --sourcefiles 理论可以不传,不传的话 只能到文件级的展示,再细需要具体代码和行数就需要这个了


