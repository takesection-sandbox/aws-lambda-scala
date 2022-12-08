AWS Lambda SnapStart を試す
===

## プロジェクトの作成

```shell
sbt new scala/hello-world.g8
```

## SnapStart がない時

```text
START RequestId: 7ec844a7-7c81-44fc-9746-16a5b8c22262 Version: $LATEST
END RequestId: 7ec844a7-7c81-44fc-9746-16a5b8c22262
REPORT RequestId: 7ec844a7-7c81-44fc-9746-16a5b8c22262
Duration: 10806.85 ms
Billed Duration: 10807 ms
Memory Size: 512 MB
Max Memory Used: 20 MB
```

## SnapStart によりリストアをした時

```text
RESTORE_START Runtime Version: java:11.v15 Runtime Version ARN 
RESTORE_REPORT Restore Duration: 204.27 ms
START RequestId: 2f98d5aa-c63b-41e8-a9d2-0d2c21d7410d Version: 2
END RequestId: 2f98d5aa-c63b-41e8-a9d2-0d2c21d7410d
REPORT RequestId: 2f98d5aa-c63b-41e8-a9d2-0d2c21d7410d
Duration: 13.82 ms
Billed Duration: 129 ms
Memory Size: 512 MB
Max Memory Used: 71 MB
Restore Duration: 204.27 ms
```
