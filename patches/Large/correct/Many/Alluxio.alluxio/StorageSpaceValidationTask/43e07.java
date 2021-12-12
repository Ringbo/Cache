diff --git a/core/server/common/src/main/java/alluxio/cli/validation/StorageSpaceValidationTask.java b/core/server/common/src/main/java/alluxio/cli/validation/StorageSpaceValidationTask.java
index 3c14997..31ba065 100644
--- a/core/server/common/src/main/java/alluxio/cli/validation/StorageSpaceValidationTask.java
+++ b/core/server/common/src/main/java/alluxio/cli/validation/StorageSpaceValidationTask.java
@@ -86,11 +86,12 @@
                 "Tier %d: Not enough space on %s. %n"
                     + "Desired quota: %s%n"
                     + "Used in tiered storage: %s%n"
-                    + "Available: %s%n",
+                    + "Available: %s (Additional %s free space required)%n",
                 level, storageEntry.getKey(),
                 FormatUtils.getSizeFromBytes(quota),
                 FormatUtils.getSizeFromBytes(used),
-                FormatUtils.getSizeFromBytes(available));
+                FormatUtils.getSizeFromBytes(available),
+                FormatUtils.getSizeFromBytes(quota - used - available));
             success = false;
           }
         }
