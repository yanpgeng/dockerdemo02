# 确定基础镜像的来源为java8，此时就不需要下载jdk
FROM java:8

# 说明维护者相关信息
MAINTAINER 鹏友 <pengyou.yp@alibaba-inc.cmo>

#将jar包复制到容器目录中，并起名为docker.jar
COPY dockerdemo02-0.0.1-SNAPSHOT.jar /docker.jar

# 暴露容器端口号为9080（该端口为yml文件中server.port端口号），启动时需要做端口映射
EXPOSE 9080

#执行shell脚本命令
CMD java -jar /docker.jar


