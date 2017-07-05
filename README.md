### 远程连接hive
```
<bean id="hiveDataSource" class="org.apache.commons.dbcp.BasicDataSource" destroy-method="close">
    <property name="driverClassName" value="${hiveDataSource.driver}" />
    <property name="url" value="${hiveDataSource.url}" />
    <property name="username" value="${hiveDataSource.userName}" />
    <property name="password" value="${hiveDataSource.passWord}" />
    <property name="initialSize" value="${hiveDataSource.initialSize}" />
    <property name="minIdle" value="${hiveDataSource.minIdle}"/>
    <property name="maxIdle" value="${hiveDataSource.maxIdle}"/>
    <property name="maxActive" value="${hiveDataSource.maxActive}" />
    <property name="testWhileIdle" value="true" />
    <property name="timeBetweenEvictionRunsMillis" value="30000" />
    <property name="validationQuery" value="SELECT 1" />
</bean>

hiveDataSource.url=jdbc:hive2://xxx:10000/
hiveDataSource.driver=org.apache.hive.jdbc.HiveDriver
hiveDataSource.userName=hdfs
hiveDataSource.passWord=
hiveDataSource.initialSize=5
hiveDataSource.minIdle=2
hiveDataSource.maxIdle=3
hiveDataSource.maxActive=10
```