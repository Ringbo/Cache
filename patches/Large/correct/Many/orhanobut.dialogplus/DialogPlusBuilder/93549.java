diff --git a/dialogplus/src/main/java/com/orhanobut/dialogplus/DialogPlusBuilder.java b/dialogplus/src/main/java/com/orhanobut/dialogplus/DialogPlusBuilder.java
index 5971932..c4cedd2 100644
--- a/dialogplus/src/main/java/com/orhanobut/dialogplus/DialogPlusBuilder.java
+++ b/dialogplus/src/main/java/com/orhanobut/dialogplus/DialogPlusBuilder.java
@@ -293,56 +293,56 @@
   /**
    * Create the dialog using this builder
    */
-  public DialogPlus create() {
+  @NonNull public DialogPlus create() {
     getHolder().setBackgroundResource(getContentBackgroundResource());
     return new DialogPlus(this);
   }
 
-  View getFooterView() {
+  @Nullable public View getFooterView() {
     return Utils.getView(context, footerViewResourceId, footerView);
   }
 
-  @Nullable View getHeaderView() {
+  @Nullable public View getHeaderView() {
     return Utils.getView(context, headerViewResourceId, headerView);
   }
 
-  Holder getHolder() {
+  @NonNull public Holder getHolder() {
     if (holder == null) {
       holder = new ListHolder();
     }
     return holder;
   }
 
-  Context getContext() {
+  @NonNull public Context getContext() {
     return context;
   }
 
-  BaseAdapter getAdapter() {
+  public BaseAdapter getAdapter() {
     return adapter;
   }
 
-  Animation getInAnimation() {
+  public Animation getInAnimation() {
     int res = (inAnimation == INVALID) ? Utils.getAnimationResource(this.gravity, true) : inAnimation;
     return AnimationUtils.loadAnimation(context, res);
   }
 
-  Animation getOutAnimation() {
+  public Animation getOutAnimation() {
     int res = (outAnimation == INVALID) ? Utils.getAnimationResource(this.gravity, false) : outAnimation;
     return AnimationUtils.loadAnimation(context, res);
   }
 
-  FrameLayout.LayoutParams getContentParams() {
+  public FrameLayout.LayoutParams getContentParams() {
     if (expanded) {
       params.height = getDefaultContentHeight();
     }
     return params;
   }
 
-  boolean isExpanded() {
+  public boolean isExpanded() {
     return expanded;
   }
 
-  FrameLayout.LayoutParams getOutmostLayoutParams() {
+  public FrameLayout.LayoutParams getOutmostLayoutParams() {
     FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(
         ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT
     );
@@ -350,31 +350,31 @@
     return params;
   }
 
-  boolean isCancelable() {
+  public boolean isCancelable() {
     return isCancelable;
   }
 
-  OnItemClickListener getOnItemClickListener() {
+  public OnItemClickListener getOnItemClickListener() {
     return onItemClickListener;
   }
 
-  OnClickListener getOnClickListener() {
+  public OnClickListener getOnClickListener() {
     return onClickListener;
   }
 
-  OnDismissListener getOnDismissListener() {
+  public OnDismissListener getOnDismissListener() {
     return onDismissListener;
   }
 
-  OnCancelListener getOnCancelListener() {
+  public OnCancelListener getOnCancelListener() {
     return onCancelListener;
   }
 
-  OnBackPressListener getOnBackPressListener() {
+  public OnBackPressListener getOnBackPressListener() {
     return onBackPressListener;
   }
 
-  int[] getContentMargin() {
+  public int[] getContentMargin() {
     int minimumMargin = context.getResources().getDimensionPixelSize(R.dimen.dialogplus_default_center_margin);
     for (int i = 0; i < margin.length; i++) {
       margin[i] = getMargin(this.gravity, margin[i], minimumMargin);
@@ -382,11 +382,11 @@
     return margin;
   }
 
-  int[] getContentPadding() {
+  public int[] getContentPadding() {
     return padding;
   }
 
-  int getDefaultContentHeight() {
+  public int getDefaultContentHeight() {
     Activity activity = (Activity) context;
     Display display = activity.getWindowManager().getDefaultDisplay();
     int displayHeight = display.getHeight() - Utils.getStatusBarHeight(activity);
@@ -396,11 +396,11 @@
     return defaultContentHeight;
   }
 
-  int getOverlayBackgroundResource() {
+  public int getOverlayBackgroundResource() {
     return overlayBackgroundResource;
   }
 
-  int getContentBackgroundResource() {
+  public int getContentBackgroundResource() {
     return contentBackgroundResource;
   }
 
@@ -421,11 +421,11 @@
     }
   }
 
-  boolean isFixedHeader() {
+  public boolean isFixedHeader() {
     return fixedHeader;
   }
 
-  boolean isFixedFooter() {
+  public boolean isFixedFooter() {
     return fixedFooter;
   }
 }
