diff --git a/src/main/java/com/gitblit/utils/RefLogUtils.java b/src/main/java/com/gitblit/utils/RefLogUtils.java
index f08c99e..355c120 100644
--- a/src/main/java/com/gitblit/utils/RefLogUtils.java
+++ b/src/main/java/com/gitblit/utils/RefLogUtils.java
@@ -294,10 +294,10 @@
 								rc));
 					}
 				} finally {
-					revWalk.release();
+					revWalk.close();
 				}
 			} finally {
-				odi.release();
+				odi.close();
 			}
 		} catch (Throwable t) {
 			error(t, repository, "Failed to commit reflog entry to {0}");
@@ -395,12 +395,12 @@
 			}
 
 			// release the treewalk
-			treeWalk.release();
+			treeWalk.close();
 
 			// finish temporary in-core index used for this commit
 			dcBuilder.finish();
 		} finally {
-			inserter.release();
+			inserter.close();
 		}
 		return inCoreIndex;
 	}
