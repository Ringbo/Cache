diff --git a/OsmAnd/src/net/osmand/plus/base/FavoriteImageDrawable.java b/OsmAnd/src/net/osmand/plus/base/FavoriteImageDrawable.java
index e965abb..5903be7 100644
--- a/OsmAnd/src/net/osmand/plus/base/FavoriteImageDrawable.java
+++ b/OsmAnd/src/net/osmand/plus/base/FavoriteImageDrawable.java
@@ -26,7 +26,7 @@
 	private Bitmap favBackground;
 	private Resources resources;
 
-	public FavoriteImageDrawable(Context ctx, int color) {
+	public FavoriteImageDrawable(Context ctx, int color, boolean withShadow) {
 		this.resources = ctx.getResources();
 		this.color = color;
 		paintIcon = new Paint();
@@ -95,12 +95,12 @@
 
 	private static TreeMap<Integer, FavoriteImageDrawable> cache = new TreeMap<>();
 
-	public static FavoriteImageDrawable getOrCreate(Context a, int color, float density) {
+	public static FavoriteImageDrawable getOrCreate(Context a, int color, boolean withShadow) {
 		color = color | 0xff000000;
-		int hash = (color << 2) + (int) (density * 6);
+		int hash = (color << 2) + (withShadow ? 1 : 0);
 		FavoriteImageDrawable drawable = cache.get(hash);
 		if (drawable == null) {
-			drawable = new FavoriteImageDrawable(a, color);
+			drawable = new FavoriteImageDrawable(a, color, withShadow);
 			drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
 			cache.put(hash, drawable);
 		}
