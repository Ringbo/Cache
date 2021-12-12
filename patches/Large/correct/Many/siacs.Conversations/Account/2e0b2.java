diff --git a/src/main/java/eu/siacs/conversations/entities/Account.java b/src/main/java/eu/siacs/conversations/entities/Account.java
index 55e3300..1fe74a6 100644
--- a/src/main/java/eu/siacs/conversations/entities/Account.java
+++ b/src/main/java/eu/siacs/conversations/entities/Account.java
@@ -270,7 +270,7 @@
 
     public void setStatus(final State status) {
         this.status = status;
-        if (status.isError) {
+        if (status.isError || status == State.ONLINE) {
             this.lastErrorStatus = status;
         }
     }
