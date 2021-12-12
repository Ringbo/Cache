diff --git a/src/main/java/com/jakewharton/u2020/ui/trending/TrendingAdapter.java b/src/main/java/com/jakewharton/u2020/ui/trending/TrendingAdapter.java
index 7137fe7..b6b4e45 100644
--- a/src/main/java/com/jakewharton/u2020/ui/trending/TrendingAdapter.java
+++ b/src/main/java/com/jakewharton/u2020/ui/trending/TrendingAdapter.java
@@ -11,7 +11,7 @@
 import java.util.List;
 import rx.functions.Action1;
 
-public final class TrendingAdapter extends RecyclerView.Adapter<TrendingAdapter.ViewHolder>
+final class TrendingAdapter extends RecyclerView.Adapter<TrendingAdapter.ViewHolder>
     implements Action1<List<Repository>> {
   public interface RepositoryClickListener {
     void onRepositoryClick(Repository repository);
