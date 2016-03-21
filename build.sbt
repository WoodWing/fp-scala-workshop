

name := "fp-workshop"

version := "1.0"

scalaVersion := "2.11.8"

Keys.useJCenter := true

/* auto-header configuration */
//import de.heikoseeberger.sbtheader.license.MIT
//headers := Map(
//  "scala" → MIT("2016", "woodwing.com"),
//  "sbt" → MIT("2016", "woodwing.com"),
//  "conf" → MIT("2016", "woodwing.com"))

incOptions := incOptions.value.withNameHashing(true).withRecompileOnMacroDef(true)

//SbtScalariform.defaultScalariformSettings
//
//ScalariformKeys.preferences := ScalariformKeys.preferences.value.
//  setPreference(AlignSingleLineCaseStatements, true).
//  setPreference(DoubleIndentClassDeclaration, true).
//  setPreference(DanglingCloseParenthesis, Prevent).
//  setPreference(RewriteArrowSymbols, true).
//  setPreference(MultilineScaladocCommentsStartOnFirstLine, true).
//  setPreference(PlaceScaladocAsterisksBeneathSecondAsterisk, true)


val ScalatestVersion = "+"

libraryDependencies ++= Seq(


  "org.scalatest" %% "scalatest" % ScalatestVersion % Test,
  "org.scalatest" %% "scalatest-matchers" % ScalatestVersion % Test
)
