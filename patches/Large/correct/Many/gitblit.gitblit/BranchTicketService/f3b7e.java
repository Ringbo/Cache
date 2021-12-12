diff --git a/src/main/java/com/gitblit/tickets/BranchTicketService.java b/src/main/java/com/gitblit/tickets/BranchTicketService.java
index 42189bf..8396693 100644
--- a/src/main/java/com/gitblit/tickets/BranchTicketService.java
+++ b/src/main/java/com/gitblit/tickets/BranchTicketService.java
@@ -297,7 +297,7 @@
 			log.error("failed to read " + file, e);
 		} finally {
 			if (rw != null) {
-				rw.release();
+				rw.close();
 			}
 		}
 		return null;
@@ -353,7 +353,7 @@
 		} catch (IOException e) {
 			log.error("", e);
 		} finally {
-			inserter.release();
+			inserter.close();
 		}
 	}
 
@@ -712,7 +712,7 @@
 			} finally {
 				// release the treewalk
 				if (treeWalk != null) {
-					treeWalk.release();
+					treeWalk.close();
 				}
 			}
 		} finally {
@@ -811,7 +811,7 @@
 			// finish the index
 			builder.finish();
 		} finally {
-			inserter.release();
+			inserter.close();
 		}
 		return newIndex;
 	}
@@ -855,7 +855,7 @@
 			}
 		} finally {
 			if (tw != null) {
-				tw.release();
+				tw.close();
 			}
 		}
 		return list;
@@ -913,10 +913,10 @@
 							rc));
 				}
 			} finally {
-				revWalk.release();
+				revWalk.close();
 			}
 		} finally {
-			odi.release();
+			odi.close();
 		}
 		return success;
 	}
