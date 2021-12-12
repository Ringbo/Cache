diff --git a/liquibase-core/src/main/java/liquibase/database/structure/UniqueConstraint.java b/liquibase-core/src/main/java/liquibase/database/structure/UniqueConstraint.java
index 8bbd64b..493cd93 100644
--- a/liquibase-core/src/main/java/liquibase/database/structure/UniqueConstraint.java
+++ b/liquibase-core/src/main/java/liquibase/database/structure/UniqueConstraint.java
@@ -103,7 +103,7 @@
 		if (result) {
 			if (null == this.getTable()) {
 				result = null == that.getTable();
-			} else if (null == this.getTable()) {
+			} else if (null == that.getTable()) {
 				result = false;
 			} else {
 				result = this.getTable().getName().equals(
