import com.typesafe.sbt.SbtScalariform._

import scalariform.formatter.preferences._

name := "fp-workshop"

version := "1.0"

scalaVersion := "2.11.8"

incOptions := incOptions.value.withNameHashing(true).withRecompileOnMacroDef(true)

SbtScalariform.defaultScalariformSettings

ScalariformKeys.preferences := ScalariformKeys.preferences.value.
  setPreference(AlignSingleLineCaseStatements, true).
  setPreference(DoubleIndentClassDeclaration, true).
  setPreference(DanglingCloseParenthesis, Prevent).
  setPreference(RewriteArrowSymbols, true).
  setPreference(MultilineScaladocCommentsStartOnFirstLine, true).
  setPreference(PlaceScaladocAsterisksBeneathSecondAsterisk, true)


val ScalatestVersion = "+"

libraryDependencies ++= Seq(


  "org.scalatest"                 %% "scalatest"                   % ScalatestVersion      % Test,
  "org.scalatest"                 %% "scalatest-matchers"          % ScalatestVersion      % Test
)
