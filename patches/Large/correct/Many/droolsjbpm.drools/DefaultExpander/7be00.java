diff --git a/drools-compiler/src/main/java/org/drools/lang/dsl/DefaultExpander.java b/drools-compiler/src/main/java/org/drools/lang/dsl/DefaultExpander.java
index 5922ad4..17c3c6f 100644
--- a/drools-compiler/src/main/java/org/drools/lang/dsl/DefaultExpander.java
+++ b/drools-compiler/src/main/java/org/drools/lang/dsl/DefaultExpander.java
@@ -45,9 +45,9 @@
     // Be EXTREMELLY careful if you decide to change bellow regexp's
     //
     // bellow regexp is used to find and parse rule parts: header, LHS, RHS, trailer, etc
-    private static final String  rulesExpr    = "(^\\s*rule.*?$.*?^\\s*when.*?$)(.*?)(^\\s*then.*?$)(.*?)(^\\s*end)";
+    private static final String  rulesExpr    = "(^\\s*rule.*?$.*?^\\s*when.*?)$(.*?)(^\\s*then.*?$)(.*?)(^\\s*end)";
     // bellow regexp is used to find and parse query parts: header, condition, trailer
-    private static final String  queryExpr    = "(^\\s*query.*?$)(.*?)(^\\s*end)";
+    private static final String  queryExpr    = "(^\\s*query.*?)$(.*?)(^\\s*end)";
 
     // bellow we combine and compile above expressions into a pattern object
     private static final Pattern finder       = Pattern.compile( "(" + rulesExpr + "|" + queryExpr + ")",
@@ -136,18 +136,18 @@
                 String headerFragment = m.group( 2 );
                 expanded.append( headerFragment ); // adding rule header and attributes
                 String lhsFragment = m.group( 3 );
-                expanded.append( this.expandLHS( lhsFragment, countNewlines( headerFragment ) + 1 ) ); // adding expanded LHS
+                expanded.append( this.expandLHS( lhsFragment, countNewlines( headerFragment ) + 2 ) ); // adding expanded LHS
                 String thenFragment = m.group( 4 ); 
                 
                 expanded.append( thenFragment ); // adding "then" header
-                expanded.append( this.expandRHS( m.group( 5 ), countNewlines( headerFragment + lhsFragment + thenFragment ) + 1 ) ); // adding expanded RHS
+                expanded.append( this.expandRHS( m.group( 5 ), countNewlines( headerFragment + lhsFragment + thenFragment ) + 2 ) ); // adding expanded RHS
                 expanded.append( m.group( 6 ) ); // adding rule trailer
                 expanded.append( "\n" );
             } else if ( constr.startsWith( "query" ) ) {
                 // match query
                 String fragment = m.group( 7 );
                 expanded.append( fragment ); // adding query header and attributes
-                expanded.append( this.expandLHS( m.group( 8 ), countNewlines( fragment ) + 1 ) ); // adding expanded LHS
+                expanded.append( this.expandLHS( m.group( 8 ), countNewlines( fragment ) + 2 ) ); // adding expanded LHS
                 expanded.append( m.group( 9 ) ); // adding query trailer
                 expanded.append( "\n" );
             } else {
@@ -234,7 +234,7 @@
                 // do we need to report errors for that?
                 if ( lines[i].equals( expanded[lastExpanded] ) ) {
                     // report error
-                    this.addError( new ExpanderException( "Unable to expand: " + lines[i].replaceAll( "[\n\r]", "" ),
+                    this.addError( new ExpanderException( "Unable to expand: " + lines[i].replaceAll( "[\n\r]", "" ).trim(),
                                                           i + lineOffset ) );
                 }
                 // but if the original starts with a "-", it means we need to add it
@@ -258,7 +258,7 @@
                     } else {
                         // error, pattern not found to add constraint to
                         // TODO: can we report character position?
-                        this.addError( new ExpanderException( "No pattern was found to add the constraint to: " + lines[i],
+                        this.addError( new ExpanderException( "No pattern was found to add the constraint to: " + lines[i].trim(),
                                                               i + lineOffset ) );
                     }
                     lastExpanded--;
