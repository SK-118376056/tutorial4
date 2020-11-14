/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringfiltermain;

/**
 *
 * @author adamoc
 */
public class StringFilter {
  String filtering_string;

  StringFilter(String inputtedStr){
    this.filtering_string = inputtedStr;
  }

  public String filter_vowels(String inputtedStr){
    return inputtedStr.replaceAll("[aeiouAEIOU]", "");
  }

  public String filter_consonants(String inputtedStr){
    return inputtedStr.replaceAll("[^aeiouAEIOU]" , "");
  }
  
//  https://www.regextester.com/21 - [^0-9] (^ same as !)
//  [a-z][A-Z][0-9]
// regex beginners - https://medium.com/@mayankv/regex-for-dummies-6542be2b4ebd
}
