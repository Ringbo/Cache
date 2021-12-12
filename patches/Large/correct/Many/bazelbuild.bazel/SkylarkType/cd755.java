diff --git a/src/main/java/com/google/devtools/build/lib/syntax/SkylarkType.java b/src/main/java/com/google/devtools/build/lib/syntax/SkylarkType.java
index ffef285..638c8e1 100644
--- a/src/main/java/com/google/devtools/build/lib/syntax/SkylarkType.java
+++ b/src/main/java/com/google/devtools/build/lib/syntax/SkylarkType.java
@@ -154,35 +154,35 @@
   // by declaring its type as TOP instead of NONE, even though at runtime,
   // we reject None from all types but NONE, and in particular from e.g. lists of Files.
   // TODO(bazel-team): resolve this inconsistency, one way or the other.
-  public static final Simple NONE = Simple.of(Runtime.NoneType.class);
+  public static final Simple NONE = Simple.forClass(Runtime.NoneType.class);
 
   /** The STRING type, for strings */
-  public static final Simple STRING = Simple.of(String.class);
+  public static final Simple STRING = Simple.forClass(String.class);
 
   /** The INTEGER type, for 32-bit signed integers */
-  public static final Simple INT = Simple.of(Integer.class);
+  public static final Simple INT = Simple.forClass(Integer.class);
 
   /** The BOOLEAN type, that contains TRUE and FALSE */
-  public static final Simple BOOL = Simple.of(Boolean.class);
+  public static final Simple BOOL = Simple.forClass(Boolean.class);
 
   /** The FUNCTION type, that contains all functions, otherwise dynamically typed at call-time */
   public static final SkylarkFunctionType FUNCTION = new SkylarkFunctionType("unknown", TOP);
 
   /** The DICT type, that contains SkylarkDict */
-  public static final Simple DICT = Simple.of(SkylarkDict.class);
+  public static final Simple DICT = Simple.forClass(SkylarkDict.class);
 
   /** The SEQUENCE type, that contains lists and tuples */
   // TODO(bazel-team): this was added for backward compatibility with the BUILD language,
   // that doesn't make a difference between list and tuple, so that functions can be declared
   // that keep not making the difference. Going forward, though, we should investigate whether
   // we ever want to use this type, and if not, make sure no existing client code uses it.
-  public static final Simple SEQUENCE = Simple.of(SkylarkList.class);
+  public static final Simple SEQUENCE = Simple.forClass(SkylarkList.class);
 
   /** The LIST type, that contains all MutableList-s */
-  public static final Simple LIST = Simple.of(MutableList.class);
+  public static final Simple LIST = Simple.forClass(MutableList.class);
 
   /** The TUPLE type, that contains all Tuple-s */
-  public static final Simple TUPLE = Simple.of(Tuple.class);
+  public static final Simple TUPLE = Simple.forClass(Tuple.class);
 
   /** The STRING_LIST type, a MutableList of strings */
   public static final SkylarkType STRING_LIST = Combination.of(LIST, STRING);
@@ -191,8 +191,7 @@
   public static final SkylarkType INT_LIST = Combination.of(LIST, INT);
 
   /** The SET type, that contains all SkylarkNestedSet-s, and the generic combinator for them */
-  public static final Simple SET = Simple.of(SkylarkNestedSet.class);
-
+  public static final Simple SET = Simple.forClass(SkylarkNestedSet.class);
 
   // Common subclasses of SkylarkType
 
@@ -279,7 +278,7 @@
         // as a substitute to handling inheritance.
         Class<?> skylarkType = EvalUtils.getSkylarkType(type);
         if (skylarkType != type) {
-          simple = Simple.of(skylarkType);
+          simple = Simple.forClass(skylarkType);
         } else {
           simple = new Simple(type);
         }
@@ -288,11 +287,15 @@
     }
 
     /**
-     * The public way to create a Simple type
+     * The way to create a Simple type.
+     *
      * @param type a Class
      * @return the Simple type that contains exactly the instances of that Class
      */
-    public static Simple of(Class<?> type) {
+    // Only call this method from SkylarkType. Calling it from outside SkylarkType leads to
+    // circular dependencies in class initialization, showing up as an NPE while initializing NONE.
+    // You actually want to call SkylarkType.of().
+    private static Simple forClass(Class<?> type) {
       return simpleCache.getUnchecked(type);
     }
   }
@@ -388,7 +391,7 @@
       }
     }
     public static SkylarkType of(Class<?> generic, Class<?> argument) {
-      return of(Simple.of(generic), Simple.of(argument));
+      return of(Simple.forClass(generic), Simple.forClass(argument));
     }
   }
 
@@ -494,7 +497,7 @@
       return of(ImmutableList.<SkylarkType>of(t1, t2));
     }
     public static SkylarkType of(Class<?> t1, Class<?> t2) {
-      return of(Simple.of(t1), Simple.of(t2));
+      return of(Simple.forClass(t1), Simple.forClass(t2));
     }
   }
 
@@ -504,7 +507,7 @@
     } else if (BaseFunction.class.isAssignableFrom(type)) {
       return new SkylarkFunctionType("unknown", TOP);
     } else {
-      return Simple.of(type);
+      return Simple.forClass(type);
     }
   }
 
@@ -574,7 +577,7 @@
     } else if (value instanceof SkylarkNestedSet) {
       return of(SET, ((SkylarkNestedSet) value).getContentType());
     } else {
-      return Simple.of(value.getClass());
+      return Simple.forClass(value.getClass());
     }
   }
 
