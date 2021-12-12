diff --git a/src/main/java/com/gitblit/wicket/SafeTextModel.java b/src/main/java/com/gitblit/wicket/SafeTextModel.java
index aef7e97..5dc1854 100644
--- a/src/main/java/com/gitblit/wicket/SafeTextModel.java
+++ b/src/main/java/com/gitblit/wicket/SafeTextModel.java
@@ -23,7 +23,7 @@
 	}
 
 	public static SafeTextModel none(String value) {
-		return new SafeTextModel(Mode.none);
+		return new SafeTextModel(value, Mode.none);
 	}
 
 	public static SafeTextModel relaxed() {
@@ -31,7 +31,7 @@
 	}
 
 	public static SafeTextModel relaxed(String value) {
-		return new SafeTextModel(Mode.relaxed);
+		return new SafeTextModel(value, Mode.relaxed);
 	}
 
 	public SafeTextModel(Mode mode) {
