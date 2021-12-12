diff --git a/servers/src/main/java/tachyon/master/TachyonMaster.java b/servers/src/main/java/tachyon/master/TachyonMaster.java
index bdc6c10..1b85915 100644
--- a/servers/src/main/java/tachyon/master/TachyonMaster.java
+++ b/servers/src/main/java/tachyon/master/TachyonMaster.java
@@ -199,8 +199,9 @@
       mAdditionalMasters = Lists.newArrayList();
       List<? extends  Master> masters = Lists.newArrayList(mBlockMaster, mFileSystemMaster);
       // Discover and register the available factories
+      // NOTE, ClassLoader is explicitly specified so we don't need to set ContextClassLoader
       ServiceLoader<MasterFactory> discoveredMasterFactories =
-          ServiceLoader.load(MasterFactory.class);
+          ServiceLoader.load(MasterFactory.class, MasterFactory.class.getClassLoader());
       for (MasterFactory factory : discoveredMasterFactories) {
         Master master = factory.create(masters, journalDirectory);
         if (master != null) {
