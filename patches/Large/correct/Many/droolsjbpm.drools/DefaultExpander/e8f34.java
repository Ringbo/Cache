diff --git a/drools-compiler/src/main/java/org/drools/lang/dsl/DefaultExpander.java b/drools-compiler/src/main/java/org/drools/lang/dsl/DefaultExpander.java
index 900e5a8..1236811 100644
--- a/drools-compiler/src/main/java/org/drools/lang/dsl/DefaultExpander.java
+++ b/drools-compiler/src/main/java/org/drools/lang/dsl/DefaultExpander.java
@@ -140,7 +140,7 @@
                 String thenFragment = m.group( 4 ); 
                 
                 expanded.append( thenFragment ); // adding "then" header
-                expanded.append( this.expandRHS( m.group( 5 ), countNewlines( headerFragment + lhsFragment + thenFragment ) + 2 ) ); // adding expanded RHS
+                expanded.append( this.expandRHS( m.group( 5 ), countNewlines( headerFragment + lhsFragment + thenFragment ) + 1 ) ); // adding expanded RHS
                 expanded.append( m.group( 6 ) ); // adding rule trailer
                 expanded.append( "\n" );
             } else if ( constr.startsWith( "query" ) ) {
