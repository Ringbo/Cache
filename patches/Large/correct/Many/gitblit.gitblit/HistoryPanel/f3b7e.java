diff --git a/src/main/java/com/gitblit/wicket/panels/HistoryPanel.java b/src/main/java/com/gitblit/wicket/panels/HistoryPanel.java
index e1706a0..5233f7c 100644
--- a/src/main/java/com/gitblit/wicket/panels/HistoryPanel.java
+++ b/src/main/java/com/gitblit/wicket/panels/HistoryPanel.java
@@ -116,7 +116,7 @@
 					}
 				} catch (Exception e) {
 				} finally {
-					tw.release();
+					tw.close();
 				}
 			}
 		}
