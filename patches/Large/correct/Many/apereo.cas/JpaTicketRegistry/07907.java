diff --git a/cas-server-support-jpa-ticket-registry/src/main/java/org/jasig/cas/ticket/registry/JpaTicketRegistry.java b/cas-server-support-jpa-ticket-registry/src/main/java/org/jasig/cas/ticket/registry/JpaTicketRegistry.java
index f051ed7..684f7fb 100644
--- a/cas-server-support-jpa-ticket-registry/src/main/java/org/jasig/cas/ticket/registry/JpaTicketRegistry.java
+++ b/cas-server-support-jpa-ticket-registry/src/main/java/org/jasig/cas/ticket/registry/JpaTicketRegistry.java
@@ -217,7 +217,7 @@
      * @param result the result
      * @return the int
      */
-    private int countToInt(final Object result) {
+    private static int countToInt(final Object result) {
         final int intval;
         if (result instanceof Long) {
             intval = ((Long) result).intValue();
