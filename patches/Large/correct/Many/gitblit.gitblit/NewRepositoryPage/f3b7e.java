diff --git a/src/main/java/com/gitblit/wicket/pages/NewRepositoryPage.java b/src/main/java/com/gitblit/wicket/pages/NewRepositoryPage.java
index b6c2359..d2589e6 100644
--- a/src/main/java/com/gitblit/wicket/pages/NewRepositoryPage.java
+++ b/src/main/java/com/gitblit/wicket/pages/NewRepositoryPage.java
@@ -359,14 +359,14 @@
 					}
 				}
 			} finally {
-				revWalk.release();
+				revWalk.close();
 			}
 		} catch (UnsupportedEncodingException e) {
 			logger().error(null, e);
 		} catch (IOException e) {
 			logger().error(null, e);
 		} finally {
-			odi.release();
+			odi.close();
 			db.close();
 		}
 		return success;
