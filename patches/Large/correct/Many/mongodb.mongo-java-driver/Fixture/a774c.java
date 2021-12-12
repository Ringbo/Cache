diff --git a/driver/src/test/unit/org/mongodb/Fixture.java b/driver/src/test/unit/org/mongodb/Fixture.java
index 9e6867c..175c4e7 100644
--- a/driver/src/test/unit/org/mongodb/Fixture.java
+++ b/driver/src/test/unit/org/mongodb/Fixture.java
@@ -70,7 +70,7 @@
     }
 
     public static boolean serverVersionAtLeast(final List<Integer> versionArray) {
-        return getCluster().getDescription().getPrimaries().get(0).getVersion().compareTo(new ServerVersion(versionArray)) >= 0;
+        return getCluster().getDescription().getAny().get(0).getVersion().compareTo(new ServerVersion(versionArray)) >= 0;
     }
 
     static class ShutdownHook extends Thread {
