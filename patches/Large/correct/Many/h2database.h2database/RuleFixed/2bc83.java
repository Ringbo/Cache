diff --git a/h2/src/main/org/h2/bnf/RuleFixed.java b/h2/src/main/org/h2/bnf/RuleFixed.java
index 1b3cfbe..e2dbb3d 100644
--- a/h2/src/main/org/h2/bnf/RuleFixed.java
+++ b/h2/src/main/org/h2/bnf/RuleFixed.java
@@ -55,7 +55,7 @@
         case DIGIT:
             return "0";
         default:
-            throw new Error("type="+type);
+            throw new AssertionError("type="+type);
         }
     }
 
@@ -92,7 +92,7 @@
         case DIGIT:
             return "" + (char) ('0' + r.nextInt(10));
         default:
-            throw new Error("type="+type);
+            throw new AssertionError("type="+type);
         }
     }
 
@@ -213,7 +213,7 @@
             }
             break;
         default:
-            throw new Error("type=" + type);
+            throw new AssertionError("type=" + type);
         }
         if (s.equals(query)) {
             return false;
@@ -292,7 +292,7 @@
             }
             break;
         default:
-            throw new Error("type="+type);
+            throw new AssertionError("type="+type);
         }
     }
 
