diff --git a/services/core/java/com/android/server/pm/EphemeralResolverConnection.java b/services/core/java/com/android/server/pm/EphemeralResolverConnection.java
index 8d926f5..68b465a 100644
--- a/services/core/java/com/android/server/pm/EphemeralResolverConnection.java
+++ b/services/core/java/com/android/server/pm/EphemeralResolverConnection.java
@@ -60,7 +60,7 @@
 
     public EphemeralResolverConnection(Context context, ComponentName componentName) {
         mContext = context;
-        mIntent = new Intent().setComponent(componentName);
+        mIntent = new Intent(Intent.ACTION_RESOLVE_EPHEMERAL_PACKAGE).setComponent(componentName);
     }
 
     public final List<EphemeralResolveInfo> getEphemeralResolveInfoList(
