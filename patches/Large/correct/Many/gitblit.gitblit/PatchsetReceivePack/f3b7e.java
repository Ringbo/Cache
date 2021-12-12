diff --git a/src/main/java/com/gitblit/git/PatchsetReceivePack.java b/src/main/java/com/gitblit/git/PatchsetReceivePack.java
index 54ffb7b..ef0b409 100644
--- a/src/main/java/com/gitblit/git/PatchsetReceivePack.java
+++ b/src/main/java/com/gitblit/git/PatchsetReceivePack.java
@@ -667,7 +667,7 @@
 					// identified the missing object earlier before we got control.
 					LOGGER.error("failed to get commit count", e);
 				} finally {
-					walk.release();
+					walk.close();
 				}
 
 				sendError("");
@@ -1078,7 +1078,7 @@
 			LOGGER.error("failed to get commit count", e);
 			return 0;
 		} finally {
-			walk.release();
+			walk.close();
 		}
 		return count;
 	}
