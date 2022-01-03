package pl.coderslab.seleniumcource.cucumber.zadaniazaliczeniowe;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/cucumber/features/zadanie01.feature",
        plugin = {"pretty","html:out"})
public class Zadanie01Test {
}
