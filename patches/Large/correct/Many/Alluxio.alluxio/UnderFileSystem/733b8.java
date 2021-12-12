diff --git a/core/common/src/main/java/alluxio/underfs/UnderFileSystem.java b/core/common/src/main/java/alluxio/underfs/UnderFileSystem.java
index 8665d35..85fc660 100644
--- a/core/common/src/main/java/alluxio/underfs/UnderFileSystem.java
+++ b/core/common/src/main/java/alluxio/underfs/UnderFileSystem.java
@@ -95,7 +95,8 @@
           // Use the factory to create the actual client for the Under File System
           return new UnderFileSystemWithLogging(
               factory.create(path, new UnderFileSystemConfiguration(ufsConf)));
-        } catch (Exception e) {
+        } catch (Throwable e) {
+          // This needs to be Throwable rather than Error to catch service loading errors
           errors.add(e);
           LOG.warn("Failed to create UnderFileSystemFactory {}", factory, e);
         }
