diff --git a/telecomm/java/android/telecom/Conference.java b/telecomm/java/android/telecom/Conference.java
index 89967d6..e2971f9 100644
--- a/telecomm/java/android/telecom/Conference.java
+++ b/telecomm/java/android/telecom/Conference.java
@@ -462,7 +462,7 @@
      * @hide
      */
     @SystemApi
-    public final Connection getPrimaryConnection() {
+    public Connection getPrimaryConnection() {
         if (mUnmodifiableChildConnections == null || mUnmodifiableChildConnections.isEmpty()) {
             return null;
         }
