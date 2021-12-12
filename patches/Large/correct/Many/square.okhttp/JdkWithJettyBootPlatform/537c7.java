diff --git a/okhttp/src/main/java/okhttp3/internal/platform/JdkWithJettyBootPlatform.java b/okhttp/src/main/java/okhttp3/internal/platform/JdkWithJettyBootPlatform.java
index 6821bdf..5dd11ee 100644
--- a/okhttp/src/main/java/okhttp3/internal/platform/JdkWithJettyBootPlatform.java
+++ b/okhttp/src/main/java/okhttp3/internal/platform/JdkWithJettyBootPlatform.java
@@ -34,7 +34,7 @@
   private final Class<?> clientProviderClass;
   private final Class<?> serverProviderClass;
 
-  public JdkWithJettyBootPlatform(Method putMethod, Method getMethod, Method removeMethod,
+  JdkWithJettyBootPlatform(Method putMethod, Method getMethod, Method removeMethod,
       Class<?> clientProviderClass, Class<?> serverProviderClass) {
     this.putMethod = putMethod;
     this.getMethod = getMethod;
@@ -110,7 +110,7 @@
     /** The protocol the server selected. */
     String selected;
 
-    public JettyNegoProvider(List<String> protocols) {
+    JettyNegoProvider(List<String> protocols) {
       this.protocols = protocols;
     }
 
