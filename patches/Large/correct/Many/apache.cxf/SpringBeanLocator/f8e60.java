diff --git a/rt/core/src/main/java/org/apache/cxf/bus/spring/SpringBeanLocator.java b/rt/core/src/main/java/org/apache/cxf/bus/spring/SpringBeanLocator.java
index 5ce46a6..880b0cb 100644
--- a/rt/core/src/main/java/org/apache/cxf/bus/spring/SpringBeanLocator.java
+++ b/rt/core/src/main/java/org/apache/cxf/bus/spring/SpringBeanLocator.java
@@ -100,7 +100,7 @@
     public List<String> getBeanNamesOfType(Class<?> type) {
         Set<String> s = new LinkedHashSet<String>(Arrays.asList(context.getBeanNamesForType(type,
                                                                                          false,
-                                                                                         true)));
+                                                                                         false)));
         s.removeAll(passThroughs);
         s.addAll(orig.getBeanNamesOfType(type));
         return new ArrayList<String>(s);
@@ -110,7 +110,7 @@
     public <T> Collection<? extends T> getBeansOfType(Class<T> type) {
         Set<String> s = new LinkedHashSet<String>(Arrays.asList(context.getBeanNamesForType(type,
                                                                                             false,
-                                                                                            true)));
+                                                                                            false)));
         s.removeAll(passThroughs);
         List<T> lst = new LinkedList<T>();
         for (String n : s) {
@@ -150,7 +150,7 @@
                                        BeanLoaderListener<T> listener) {
         List<String> list = new ArrayList<String>(Arrays.asList(context.getBeanNamesForType(type,
                                                                                             false,
-                                                                                            true)));
+                                                                                            false)));
         list.removeAll(passThroughs);
         Collections.reverse(list);
         boolean loaded = false;
