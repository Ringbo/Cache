diff --git a/viewflow/src/org/taptwo/android/widget/TitleFlowIndicator.java b/viewflow/src/org/taptwo/android/widget/TitleFlowIndicator.java
index a8f8770..9ec9920 100644
--- a/viewflow/src/org/taptwo/android/widget/TitleFlowIndicator.java
+++ b/viewflow/src/org/taptwo/android/widget/TitleFlowIndicator.java
@@ -102,7 +102,7 @@
 		paintFooterLine = new Paint();
 		paintFooterLine.setStyle(Paint.Style.FILL_AND_STROKE);
 		paintFooterLine.setStrokeWidth(footerLineHeight);
-		paintFooterLine.setColor(FOOTER_COLOR);
+		paintFooterLine.setColor(footerColor);
 		paintFooterTriangle = new Paint();
 		paintFooterTriangle.setStyle(Paint.Style.FILL_AND_STROKE);
 		paintFooterTriangle.setColor(footerColor);
