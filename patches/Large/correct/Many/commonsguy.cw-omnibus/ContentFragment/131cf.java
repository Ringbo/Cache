diff --git a/Fragments/Dynamic/src/com/commonsware/android/dfrag/ContentFragment.java b/Fragments/Dynamic/src/com/commonsware/android/dfrag/ContentFragment.java
index 6da4020..ea69bd0 100644
--- a/Fragments/Dynamic/src/com/commonsware/android/dfrag/ContentFragment.java
+++ b/Fragments/Dynamic/src/com/commonsware/android/dfrag/ContentFragment.java
@@ -28,7 +28,7 @@
   public View onCreateView(LayoutInflater inflater,
                            ViewGroup container,
                            Bundle savedInstanceState) {
-    View result=inflater.inflate(R.layout.mainfrag, container);
+    View result=inflater.inflate(R.layout.mainfrag, container, false);
 
     result.findViewById(R.id.showOther).setOnClickListener(this);
 
