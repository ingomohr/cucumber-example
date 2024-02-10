![Build](https://github.com/ingomohr/cucumber-example/actions/workflows/mvn-build-master.yml/badge.svg?branch=master)

## What's This?
This is a small example of how to use Cucumber in a Java project (Java 17, JUnit5)

It's based on:
* [Cucumber-JVM instruction](https://cucumber.io/docs/installation/java/)
* [Cucumber 10min tutorial](https://cucumber.io/docs/guides/10-minute-tutorial/?lang=java)

... and a little bit of StackOverflow and Copilot

## What are my Take-Aways in General?
* 🥳 BDD as executable specs is great
* ❓ Refactoring step defs w/o IDE integration must be pita
  * Integration in VSCode is kinda helpful in these matters, though
* 👍 for `cucumber-archetype` Maven plugin (which I didn't use because I wasn't patient enough to read the docs beforehand ;))
* 👍 for the very readable console output when building w/ mvn
* ❓ No support for boolean parameters oob?
* 👍 You can specify your own parameter types, though


## What are my IDE-Integration Take-Aways?
* The [VSCode extension](https://github.com/cucumber/vscode) works well-ish and is (according to the Github repo) frequently updated
* Didn't try the [Eclipse integration](https://github.com/cucumber/cucumber-eclipse)
  * There is a 2.0.0 snapshot updatesite that [cannot be installed](https://github.com/cucumber/cucumber-eclipse/issues/507)
  * There is a 1.0.0 build that's from 2021
  * The last official release was in 2018, apparently
  * Might try that one later as there are commits coming in

