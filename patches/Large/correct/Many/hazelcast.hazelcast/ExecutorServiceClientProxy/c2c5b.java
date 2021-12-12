diff --git a/hazelcast-client/src/main/java/com/hazelcast/client/ExecutorServiceClientProxy.java b/hazelcast-client/src/main/java/com/hazelcast/client/ExecutorServiceClientProxy.java
index 675dddb..b9d8a6c 100644
--- a/hazelcast-client/src/main/java/com/hazelcast/client/ExecutorServiceClientProxy.java
+++ b/hazelcast-client/src/main/java/com/hazelcast/client/ExecutorServiceClientProxy.java
@@ -135,7 +135,7 @@
             private void handle(Object response) {
                 Object result = response;
                 if (response == null) {
-                    inner.innerSetException(new TimeoutException());
+                    inner.innerSetException(new TimeoutException(), false);
                 } else {
                     if (response instanceof Packet) {
                         Packet responsePacket = (Packet) response;
@@ -145,7 +145,7 @@
                         MemberLeftException memberLeftException = (MemberLeftException) result;
                         inner.innerSetMemberLeft(memberLeftException.getMember());
                     } else if (result instanceof Throwable) {
-                        inner.innerSetException((Throwable) result);
+                        inner.innerSetException((Throwable) result, true);
                     } else {
                         if (dt instanceof MultiTask) {
                             if (result != null) {
