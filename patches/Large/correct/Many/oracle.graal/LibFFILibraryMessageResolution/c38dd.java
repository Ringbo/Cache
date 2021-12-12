diff --git a/truffle/src/com.oracle.truffle.nfi/src/com/oracle/truffle/nfi/impl/LibFFILibraryMessageResolution.java b/truffle/src/com.oracle.truffle.nfi/src/com/oracle/truffle/nfi/impl/LibFFILibraryMessageResolution.java
index dea29f0..87a9758 100644
--- a/truffle/src/com.oracle.truffle.nfi/src/com/oracle/truffle/nfi/impl/LibFFILibraryMessageResolution.java
+++ b/truffle/src/com.oracle.truffle.nfi/src/com/oracle/truffle/nfi/impl/LibFFILibraryMessageResolution.java
@@ -60,7 +60,7 @@
         protected TruffleObject lookup(LibFFILibrary receiver, String symbol) {
             try {
                 return ctxRef.get().lookupSymbol(receiver, symbol);
-            } catch (NFIUnsatisfiedLinkError ex) {
+            } catch (UnsatisfiedLinkError ex) {
                 throw UnknownIdentifierException.raise(symbol);
             }
         }
@@ -89,7 +89,7 @@
             try {
                 ctxRef.get().lookupSymbol(receiver, symbol);
                 return KeyInfo.READABLE;
-            } catch (NFIUnsatisfiedLinkError ex) {
+            } catch (UnsatisfiedLinkError ex) {
                 return KeyInfo.NONE;
             }
         }
