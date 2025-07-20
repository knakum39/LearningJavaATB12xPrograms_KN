| Scenario TID | TestCase Description | PreCondition | TestSteps | Expected Result | Actual Result | Steps to Execute | Expected Result | Actual Result | Status | Executed QA Name | Misc (Comments) | Priority | Is Automated |
|--------------|----------------------|--------------|-----------|------------------|----------------|------------------|------------------|----------------|--------|-------------------|------------------|----------|--------------|
| TC_001 | Valid ISBN10 number (numeric) | API is up | Send `0471958697` | true |  | Use SOAP 1.1 XML | true |  | Pending |  | Common valid ISBN | High | Yes |
| TC_002 | Valid ISBN10 with 'X' checksum | API is up | Send `0306406152` | true |  | Use valid ISBN with X | true |  | Pending |  | X at end | High | Yes |
| TC_003 | Invalid ISBN (wrong checksum) | API is up | Send `0471958699` | false |  | Invalid last digit | false |  | Pending |  | Fails checksum | High | Yes |
| TC_004 | ISBN too short | API is up | Send `12345` | false or error |  | Input < 10 chars | false |  | Pending |  | Too short | Medium | Yes |
| TC_005 | ISBN too long | API is up | Send `1234567890123` | false or error |  | Input > 10 chars | false |  | Pending |  | Too long | Medium | Yes |
| TC_006 | ISBN with letter | API is up | Send `04719A8697` | false |  | Alphanumeric in middle | false |  | Pending |  | Invalid char | High | Yes |
| TC_007 | ISBN with special characters | API is up | Send `04719#8697` | false |  | Use `#` in input | false |  | Pending |  | Special char | Medium | Yes |
| TC_008 | Empty input | API is up | Send empty string | error or false |  | Empty payload | false |  | Pending |  | Null case | High | Yes |
| TC_009 | Null input | API is up | Send null field | error or false |  | Null `sISBN` | false |  | Pending |  | Missing input | High | Yes |
| TC_010 | Random digits (uniform) | API is up | Send `1111111111` | false |  | Not a valid ISBN | false |  | Pending |  | Random digits | Medium | Yes |
| TC_011 | SQL injection attempt | API is up | Send `' OR 1=1` | error |  | Injected string | error |  | Pending |  | Security test | High | Yes |
| TC_012 | XSS injection attempt | API is up | Send `<script>` | error |  | JS injection | error |  | Pending |  | XSS test | High | Yes |
| TC_013 | Valid ISBN via SOAP 1.2 | API is up | Send valid ISBN with SOAP 1.2 | true |  | Use SOAP 1.2 envelope | true |  | Pending |  | Protocol test | High | Yes |
| TC_014 | Valid ISBN via JSON | API is up | Send `0471958697` via JSON | true |  | Use JSON format | true |  | Pending |  | Format test | High | Yes |
| TC_015 | Missing Content-Type | API is up | Send without header | error |  | Remove `Content-Type` | 415 |  | Pending |  | Header missing | High | Yes |
| TC_016 | Invalid Content-Type | API is up | Use `text/plain` | error |  | Wrong header type | 415 |  | Pending |  | MIME type issue | High | Yes |
| TC_017 | No headers at all | API is up | Blank header set | error |  | Send raw payload | error |  | Pending |  | Headerless call | High | Yes |
| TC_018 | Hyphenated ISBN | API is up | Send `0-321-14653-0` | false |  | Input with dashes | false |  | Pending |  | Format mismatch | Medium | Yes |
| TC_019 | Chinese characters | API is up | Send `书本编号1234` | error |  | Unicode input | error |  | Pending |  | UTF-8 validation | Medium | Yes |
| TC_020 | Arabic numerals | API is up | Send `١٢٣٤٥٦٧٨٩٠` | false |  | Use Arabic digits | false |  | Pending |  | Locale check | Medium | Yes |
| TC_021 | Mixed Arabic/English | API is up | Send `١٢٣4567890` | false |  | Mixed digit set | false |  | Pending |  | Input encoding | Medium | Yes |
| TC_022 | ISBN with emoji | API is up | Send `12345678😀0` | error |  | Emoji in input | error |  | Pending |  | Non-numeric | Medium | Yes |
| TC_023 | Lowercase 'x' in ISBN | API is up | Send `123456789x` | false |  | Lowercase instead of 'X' | false |  | Pending |  | Case sensitivity | Medium | Yes |
| TC_024 | Input with whitespace | API is up | Send ` 0471958697 ` | false |  | Spaces in input | false |  | Pending |  | Trim issue | Medium | Yes |
| TC_025 | Input with newline | API is up | Send `0471958697\n` | false |  | Line break | false |  | Pending |  | Invalid char | Low | Yes |
| TC_026 | Input with tab | API is up | Send `12345678\t90` | false |  | Tab in input | false |  | Pending |  | Formatting issue | Medium | Yes |
| TC_027 | Alphabet-only input | API is up | Send `ABCDEFGHIJ` | false |  | Only letters | false |  | Pending |  | Bad format | Medium | Yes |
| TC_028 | Single digit input | API is up | Send `1` | false |  | Too short | false |  | Pending |  | Length validation | Medium | Yes |
| TC_029 | ISBN of all 9s | API is up | Send `9999999999` | false |  | Upper edge | false |  | Pending |  | Edge check | Medium | Yes |
| TC_030 | Edge ISBN with X | API is up | Send `000000000X` | true or false |  | Valid pattern test | true/false |  | Pending |  | Rare case | Medium | Yes |
| TC_031 | No cookies sent | API is up | Disable cookies | Valid response |  | Stateless call | true |  | Pending |  | Cookie-agnostic | Low | Yes |
| TC_032 | SOAP tag lowercase | API is up | Use `<sisbn>` tag | error |  | Invalid XML | error |  | Pending |  | Tag mismatch | Medium | Yes |
