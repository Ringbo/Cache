diff --git a/core/java/android/app/FragmentManager.java b/core/java/android/app/FragmentManager.java
index 399987f..23bcb6e 100644
--- a/core/java/android/app/FragmentManager.java
+++ b/core/java/android/app/FragmentManager.java
@@ -314,14 +314,17 @@
     public abstract Fragment getFragment(Bundle bundle, String key);
 
     /**
-     * Get a collection of all fragments that are currently added to the FragmentManager.
+     * Get a list of all fragments that are currently added to the FragmentManager.
      * This may include those that are hidden as well as those that are shown.
      * This will not include any fragments only in the back stack, or fragments that
      * are detached or removed.
+     * <p>
+     * The order of the fragments in the list is the order in which they were
+     * added or attached.
      *
-     * @return A collection of all fragments that are added to the FragmentManager.
+     * @return A list of all fragments that are added to the FragmentManager.
      */
-    public abstract Collection<Fragment> getFragments();
+    public abstract List<Fragment> getFragments();
 
     /**
      * Save the current instance state of the given Fragment.  This can be
@@ -907,12 +910,12 @@
     }
 
     @Override
-    public Collection<Fragment> getFragments() {
+    public List<Fragment> getFragments() {
         if (mAdded == null) {
             return Collections.EMPTY_LIST;
         }
         synchronized (mAdded) {
-            return (Collection<Fragment>) mAdded.clone();
+            return (List<Fragment>) mAdded.clone();
         }
     }
 
