diff --git a/src/com/jfoenix/controls/JFXRippler.java b/src/com/jfoenix/controls/JFXRippler.java
index ea837d0..fedf36b 100644
--- a/src/com/jfoenix/controls/JFXRippler.java
+++ b/src/com/jfoenix/controls/JFXRippler.java
@@ -276,7 +276,7 @@
 							// remove overlay rect after 200 ms in case rippler is not generated
 							new Thread(()->{
 								try { Thread.sleep(200); } catch (Exception e1) { }
-								if(getChildren().size() == 1)
+								if(getChildren().size() == 1 && !toggled)
 									resetOverLay();
 							}).start();
 						});
