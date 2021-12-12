diff --git a/src/main/org/codehaus/groovy/runtime/MethodRankHelper.java b/src/main/org/codehaus/groovy/runtime/MethodRankHelper.java
index d828a89..f4ae991 100644
--- a/src/main/org/codehaus/groovy/runtime/MethodRankHelper.java
+++ b/src/main/org/codehaus/groovy/runtime/MethodRankHelper.java
@@ -73,7 +73,7 @@
         List<MetaMethod> methods = new ArrayList<MetaMethod>(ci.getMetaClass().getMethods());
         methods.addAll(ci.getMetaClass().getMetaMethods());
         List<MetaMethod> sugg = rankMethods(methodName,arguments,methods);
-        StringBuffer sb = new StringBuffer();
+        StringBuilder sb = new StringBuilder();
         if (!sugg.isEmpty()){
             sb.append("\nPossible solutions: ");
             for(int i = 0; i < sugg.size(); i++) {
@@ -148,7 +148,7 @@
     public static String getConstructorSuggestionString(Class type, Object[] arguments){
         Constructor[] sugg = rankConstructors(arguments, type.getConstructors());
         if(sugg.length >0){
-            StringBuffer sb = new StringBuffer();
+            StringBuilder sb = new StringBuilder();
             sb.append("\nPossible solutions: ");
             for(int i = 0; i < sugg.length; i++){
                 if(i != 0) sb.append(", ");
@@ -174,7 +174,7 @@
         ClassInfo ci = ClassInfo.getClassInfo(type);
         List<MetaProperty>  fi = ci.getMetaClass().getProperties();
         List<RankableField> rf = new ArrayList<RankableField>(fi.size());
-        StringBuffer sb = new StringBuffer();
+        StringBuilder sb = new StringBuilder();
         sb.append("\nPossible solutions: ");
         
         for(MetaProperty mp : fi) rf.add(new RankableField(fieldName, mp));
@@ -198,7 +198,7 @@
      * @return the Class names
      */
     private static String listParameterNames(Class[] cachedClasses){
-      StringBuffer sb = new StringBuffer();
+        StringBuilder sb = new StringBuilder();
       for(int i =0; i < cachedClasses.length;i++){
           if(i != 0) sb.append(", ");
           sb.append(cachedClasses[i].getName());
@@ -208,7 +208,7 @@
     
     
     private static String listParameterNames(CachedClass[] cachedClasses){
-        StringBuffer sb = new StringBuffer();
+        StringBuilder sb = new StringBuilder();
         for(int i =0; i < cachedClasses.length;i++){
             if(i != 0) sb.append(", ");
             sb.append(cachedClasses[i].getName());
