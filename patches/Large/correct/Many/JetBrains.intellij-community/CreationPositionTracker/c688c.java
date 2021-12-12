diff --git a/java/debugger/impl/src/com/intellij/debugger/memory/component/CreationPositionTracker.java b/java/debugger/impl/src/com/intellij/debugger/memory/component/CreationPositionTracker.java
index e49668f..ca8c6a9 100644
--- a/java/debugger/impl/src/com/intellij/debugger/memory/component/CreationPositionTracker.java
+++ b/java/debugger/impl/src/com/intellij/debugger/memory/component/CreationPositionTracker.java
@@ -41,7 +41,7 @@
   private final ConcurrentHashMap<XDebugSession, Map<ObjectReference, List<StackFrameItem>>>
       myPinnedSession2Reference2Stack = new ConcurrentHashMap<>();
 
-  public CreationPositionTracker(Project project) {
+  public CreationPositionTracker(@NotNull Project project) {
     super(project);
   }
 
@@ -52,7 +52,7 @@
 
   @Nullable
   public List<StackFrameItem> getStack(@NotNull XDebugSession session, @NotNull ObjectReference ref) {
-    List<StackFrameItem> stack = extract(mySession2Reference2Stack, session, ref);
+    final List<StackFrameItem> stack = extract(mySession2Reference2Stack, session, ref);
     return stack != null ? stack : extract(myPinnedSession2Reference2Stack, session, ref);
   }
 
@@ -78,11 +78,11 @@
   }
 
   public void unpinStacks(@NotNull XDebugSession session, @NotNull ReferenceType ref) {
-    Map<ObjectReference, List<StackFrameItem>> ref2Stack = myPinnedSession2Reference2Stack.getOrDefault(session, null);
+    final Map<ObjectReference, List<StackFrameItem>> ref2Stack = myPinnedSession2Reference2Stack.get(session);
     if (ref2Stack != null) {
-      Iterator<ObjectReference> iterator = ref2Stack.keySet().iterator();
+      final Iterator<ObjectReference> iterator = ref2Stack.keySet().iterator();
       while (iterator.hasNext()) {
-        ObjectReference reference = iterator.next();
+        final ObjectReference reference = iterator.next();
         if (ref.equals(reference.referenceType())) {
           iterator.remove();
         }
@@ -95,9 +95,9 @@
   }
 
   public void pinStacks(@NotNull XDebugSession session, @NotNull ReferenceType ref) {
-    Map<ObjectReference, List<StackFrameItem>> ref2Stack = mySession2Reference2Stack.getOrDefault(session, null);
+    final Map<ObjectReference, List<StackFrameItem>> ref2Stack = mySession2Reference2Stack.get(session);
     if (ref2Stack != null) {
-      Map<ObjectReference, List<StackFrameItem>> ref2StacksByReferenceType = ref2Stack.entrySet().stream()
+      final Map<ObjectReference, List<StackFrameItem>> ref2StacksByReferenceType = ref2Stack.entrySet().stream()
           .filter(entry -> ref.equals(entry.getKey().referenceType()))
           .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
       myPinnedSession2Reference2Stack.put(session, ref2StacksByReferenceType);
@@ -107,9 +107,9 @@
   @Nullable
   private static<T> T extract(@NotNull Map<XDebugSession, Map<ObjectReference, T>> map,
                               @NotNull XDebugSession session, @NotNull ObjectReference ref) {
-    Map<ObjectReference, T> ref2something = map.getOrDefault(session, null);
+    final Map<ObjectReference, T> ref2something = map.get(session);
     if(ref2something != null) {
-      return ref2something.getOrDefault(ref, null);
+      return ref2something.get(ref);
     }
 
     return null;
