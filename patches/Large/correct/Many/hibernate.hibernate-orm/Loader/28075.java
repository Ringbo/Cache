diff --git a/hibernate-core/src/main/java/org/hibernate/loader/Loader.java b/hibernate-core/src/main/java/org/hibernate/loader/Loader.java
index e54d21a..62e6516 100644
--- a/hibernate-core/src/main/java/org/hibernate/loader/Loader.java
+++ b/hibernate-core/src/main/java/org/hibernate/loader/Loader.java
@@ -1700,7 +1700,7 @@
 		final boolean canScroll = getFactory().getSettings().isScrollableResultSetsEnabled();
 		final boolean useScrollableResultSetToSkip = hasFirstRow &&
 				!useLimitOffset && canScroll;
-		final ScrollMode scrollMode = getScrollMode( scroll, hasFirstRow, useLimit, queryParameters );
+		final ScrollMode scrollMode = getScrollMode( scroll, hasFirstRow, useLimitOffset, queryParameters );
 //
 //		if(canScroll && ( scroll || useScrollableResultSetToSkip )){
 //			 scrollMode = scroll ? queryParameters.getScrollMode() : ScrollMode.SCROLL_INSENSITIVE;
