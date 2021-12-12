diff --git a/src/main/java/com/nextcloud/android/sso/aidl/NextcloudRequest.java b/src/main/java/com/nextcloud/android/sso/aidl/NextcloudRequest.java
index 880cec3..5ddfe49 100644
--- a/src/main/java/com/nextcloud/android/sso/aidl/NextcloudRequest.java
+++ b/src/main/java/com/nextcloud/android/sso/aidl/NextcloudRequest.java
@@ -26,7 +26,7 @@
 
 public class NextcloudRequest implements Serializable {
 
-    private static final long serialVersionUID = 215521212534238L; //assign a long value
+    private static final long serialVersionUID = 215521212534239L; //assign a long value
 
     private String method;
     private Map<String, List<String>> header = new HashMap<>();
@@ -36,7 +36,7 @@
     private String token;
     private String packageName;
     private String accountName;
-    private boolean followRedirects = false;
+    private boolean followRedirects;
 
     private NextcloudRequest() { }
 
@@ -92,7 +92,7 @@
         }
 
         /**
-         * Default: true
+         * Default value: true
          * @param followRedirects
          * @return
          */
@@ -146,7 +146,7 @@
         this.accountName = accountName;
     }
 
-    public boolean getFollowRedirects() {
+    public boolean isFollowRedirects() {
         return this.followRedirects;
     }
 
