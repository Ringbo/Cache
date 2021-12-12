diff --git a/portal-impl/src/com/liferay/portal/servlet/filters/aggregate/AggregateFilter.java b/portal-impl/src/com/liferay/portal/servlet/filters/aggregate/AggregateFilter.java
index 3549257..5ddd615 100644
--- a/portal-impl/src/com/liferay/portal/servlet/filters/aggregate/AggregateFilter.java
+++ b/portal-impl/src/com/liferay/portal/servlet/filters/aggregate/AggregateFilter.java
@@ -70,7 +70,7 @@
 			AggregateContext aggregateContext, String content)
 		throws IOException {
 
-		StringBundler sb = new StringBundler(content.length());
+		StringBundler sb = new StringBundler();
 
 		int pos = 0;
 
