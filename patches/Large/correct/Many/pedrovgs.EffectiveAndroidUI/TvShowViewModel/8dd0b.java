diff --git a/app/src/main/java/com/github/pedrovgs/effectiveandroidui/ui/viewmodel/TvShowViewModel.java b/app/src/main/java/com/github/pedrovgs/effectiveandroidui/ui/viewmodel/TvShowViewModel.java
index 00ba3da..bbd5503 100644
--- a/app/src/main/java/com/github/pedrovgs/effectiveandroidui/ui/viewmodel/TvShowViewModel.java
+++ b/app/src/main/java/com/github/pedrovgs/effectiveandroidui/ui/viewmodel/TvShowViewModel.java
@@ -39,7 +39,7 @@
   private final GetTvShowById getTvShowById;
   private final ShowTvShowOnBrowserActionCommand showTvShowOnBrowserActionCommand;
 
-  private TvShowFragment listener;
+  private Listener listener;
   private boolean isReady;
 
   @Inject
@@ -79,7 +79,7 @@
     this.listener = listener;
   }
 
-  public TvShowFragment getListener() {
+  public Listener getListener() {
     return listener;
   }
 
@@ -126,7 +126,8 @@
   }
 
   /**
-   * Interface created to work as ViewModel listener. Every change in the view model will be
+   * Interface created to work as ViewModel listener.
+   * Every change in the view model will be
    * notified to Listener implementation.
    */
   public interface Listener {
