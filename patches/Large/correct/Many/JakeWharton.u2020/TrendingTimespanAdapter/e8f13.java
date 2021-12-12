diff --git a/src/main/java/com/jakewharton/u2020/ui/trending/TrendingTimespanAdapter.java b/src/main/java/com/jakewharton/u2020/ui/trending/TrendingTimespanAdapter.java
index 3e1008d..b89e8be 100644
--- a/src/main/java/com/jakewharton/u2020/ui/trending/TrendingTimespanAdapter.java
+++ b/src/main/java/com/jakewharton/u2020/ui/trending/TrendingTimespanAdapter.java
@@ -7,7 +7,7 @@
 import com.jakewharton.u2020.R;
 import com.jakewharton.u2020.ui.misc.EnumAdapter;
 
-public final class TrendingTimespanAdapter extends EnumAdapter<TrendingTimespan> {
+final class TrendingTimespanAdapter extends EnumAdapter<TrendingTimespan> {
   public TrendingTimespanAdapter(Context context) {
     super(context, TrendingTimespan.class);
   }
