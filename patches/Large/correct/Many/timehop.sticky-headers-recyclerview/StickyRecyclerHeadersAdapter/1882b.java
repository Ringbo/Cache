diff --git a/library/src/main/java/com/timehop/stickyheadersrecyclerview/StickyRecyclerHeadersAdapter.java b/library/src/main/java/com/timehop/stickyheadersrecyclerview/StickyRecyclerHeadersAdapter.java
index c19ea46..23990fa 100644
--- a/library/src/main/java/com/timehop/stickyheadersrecyclerview/StickyRecyclerHeadersAdapter.java
+++ b/library/src/main/java/com/timehop/stickyheadersrecyclerview/StickyRecyclerHeadersAdapter.java
@@ -7,30 +7,33 @@
   /**
    * Get the ID of the header associated with this item.  For example, if your headers group
    * items by their first letter, you could return the character representation of the first letter.
-   * Return a value < 0 if the view should not have a header (like, a header view or footer view)
+   * Return a value &lt; 0 if the view should not have a header (like, a header view or footer view)
    *
-   * @param position
-   * @return
+   * @param position the position of the view to get the header ID of
+   * @return the header ID
    */
-  public long getHeaderId(int position);
+  long getHeaderId(int position);
 
   /**
    * Creates a new ViewHolder for a header.  This works the same way onCreateViewHolder in
    * Recycler.Adapter, ViewHolders can be reused for different views.  This is usually a good place
    * to inflate the layout for the header.
    *
-   * @param parent
-   * @return
+   * @param parent the view to create a header view holder for
+   * @return the view holder
    */
-  public VH onCreateHeaderViewHolder(ViewGroup parent);
+  VH onCreateHeaderViewHolder(ViewGroup parent);
 
   /**
    * Binds an existing ViewHolder to the specified adapter position.
    *
-   * @param holder
-   * @param position
+   * @param holder the view holder
+   * @param position the adapter position
    */
-  public void onBindHeaderViewHolder(VH holder, int position);
+  void onBindHeaderViewHolder(VH holder, int position);
 
-  public int getItemCount();
+  /**
+   * @return the number of views in the adapter
+   */
+  int getItemCount();
 }
