diff --git a/deeplearning4j-ui-parent/deeplearning4j-ui-model/src/main/java/org/deeplearning4j/ui/storage/sqlite/J7FileStatsStorage.java b/deeplearning4j-ui-parent/deeplearning4j-ui-model/src/main/java/org/deeplearning4j/ui/storage/sqlite/J7FileStatsStorage.java
index e395321..2c199b1 100644
--- a/deeplearning4j-ui-parent/deeplearning4j-ui-model/src/main/java/org/deeplearning4j/ui/storage/sqlite/J7FileStatsStorage.java
+++ b/deeplearning4j-ui-parent/deeplearning4j-ui-model/src/main/java/org/deeplearning4j/ui/storage/sqlite/J7FileStatsStorage.java
@@ -574,7 +574,7 @@
             while (rs.next()) {
                 list.add(rs.getLong(1));
             }
-            return list.elements();
+            return list.toLongArray();
         } catch (SQLException e) {
             throw new RuntimeException(e);
         }
