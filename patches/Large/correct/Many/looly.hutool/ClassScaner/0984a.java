diff --git a/hutool-core/src/main/java/cn/hutool/core/lang/ClassScaner.java b/hutool-core/src/main/java/cn/hutool/core/lang/ClassScaner.java
index dcf3e3e..5001ab1 100644
--- a/hutool-core/src/main/java/cn/hutool/core/lang/ClassScaner.java
+++ b/hutool-core/src/main/java/cn/hutool/core/lang/ClassScaner.java
@@ -256,7 +256,7 @@
 				if (classFilter == null || classFilter.accept(clazz)) {
 					classes.add(clazz);
 				}
-			} catch (Exception ex) {
+			} catch (Throwable ex) {
 				// Pass Load Error.
 			}
 		}
