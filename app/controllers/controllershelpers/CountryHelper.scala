/*
 * Copyright 2020 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package controllers.controllershelpers

import com.google.inject.Inject
import models.Country

class CountryHelper @Inject()() {

  val countries = List(
    Country("Gibraltar"),
    Country("Guernsey"),
    Country("Jersey"),
    Country("Malta"),
    Country("Sark"),
    Country("Isle Of Man"),
    Country("Tours"),
    Country("Alderney"),
    Country("Antigua"),
    Country("Australia"),
    Country("Bahamas"),
    Country("Barbados"),
    Country("Bermuda"),
    Country("Maldive Islands"),
    Country("Cayman Islands"),
    Country("Cook Islands"),
    Country("Commonwealth Of Dominica"),
    Country("Falkland Islands"),
    Country("Fiji"),
    Country("Kiribati"),
    Country("Jamaica"),
    Country("Hong Kong"),
    Country("Mauritius"),
    Country("Montserrat"),
    Country("Vanuatu"),
    Country("New Zealand"),
    Country("Norfolk Island"),
    Country("Papua New Guinea"),
    Country("St Helena & Depnds"),
    Country("Nevis,St Kitts-Nevis"),
    Country("St Vincent & Grenadines"),
    Country("Seychelles"),
    Country("Solomon Islands"),
    Country("Tuvalu"),
    Country("Trinidad & Tobago"),
    Country("Turks & Caicos Islands"),
    Country("Virgin Islands (British)"),
    Country("Western Samoa"),
    Country("Anguilla"),
    Country("Grenada"),
    Country("St Lucia"),
    Country("Nauru"),
    Country("Greenland"),
    Country("Canada"),
    Country("Guam"),
    Country("Ascencion Island"),
    Country("Bahrain"),
    Country("Botswana"),
    Country("Brunei"),
    Country("Burma"),
    Country("Sri Lanka"),
    Country("Bhutan"),
    Country("Gambia"),
    Country("Ghana"),
    Country("Guyana"),
    Country("Antarctic Territories (British)"),
    Country("India"),
    Country("Jordan"),
    Country("Kenya"),
    Country("Kuwait"),
    Country("Lesotho"),
    Country("Libya"),
    Country("Malawi"),
    Country("Malaysia"),
    Country("Oman"),
    Country("Nigeria"),
    Country("Pakistan"),
    Country("Democratic Yemen"),
    Country("Qatar"),
    Country("South Africa"),
    Country("Sabah"),
    Country("Sarawak"),
    Country("Sharjah"),
    Country("Sierra Leone"),
    Country("Singapore"),
    Country("Swaziland"),
    Country("Tanzania"),
    Country("Arab Emirates (United)"),
    Country("Uganda"),
    Country("Zambia"),
    Country("Namibia"),
    Country("Bangladesh"),
    Country("Tonga"),
    Country("Bissau (Guinea)"),
    Country("Mongolia"),
    Country("North Korea"),
    Country("Principe and Sao Tome"),
    Country("Cape Verde Islands"),
    Country("Comoro Islands"),
    Country("Equatorial Guinea"),
    Country("American Samoa"),
    Country("Barbuda"),
    Country("Virgin Islands (USA)"),
    Country("St Martins"),
    Country("Russian Federation"),
    Country("Republic Of Armenia"),
    Country("Republic Of Belarus"),
    Country("Republic Of Kazakhstan"),
    Country("Republic Of Kyrgyzstan"),
    Country("Republic Of Moldova"),
    Country("Republic Of Tajikistan"),
    Country("Republic Of Turkmenistan"),
    Country("Republic Of Uzbekistan"),
    Country("Republic Of Azerbaijan"),
    Country("Republic Of Estonia"),
    Country("Republic Of Georgia"),
    Country("Republic Of Latvia"),
    Country("Republic Of Lithuania"),
    Country("Ukraine"),
    Country("Republic Of Ireland"),
    Country("Channel Islands"),
    Country("Andorra"),
    Country("Austria"),
    Country("Belgium"),
    Country("Bulgaria"),
    Country("Denmark"),
    Country("Finland"),
    Country("France"),
    Country("Germany"),
    Country("Greece"),
    Country("Hungary"),
    Country("Italy"),
    Country("Luxembourg"),
    Country("Netherlands"),
    Country("Norway"),
    Country("Poland"),
    Country("Portugal"),
    Country("Romania"),
    Country("Spain"),
    Country("Sweden"),
    Country("Switzerland"),
    Country("Turkey"),
    Country("Monaco"),
    Country("Albania"),
    Country("Cyprus"),
    Country("Iceland"),
    Country("Liechtenstein"),
    Country("Faroe Islands"),
    Country("San Marino"),
    Country("Vatican City State"),
    Country("Rep Of Bosnia-Herzegovina"),
    Country("Republic Of Croatia"),
    Country("Former Yug Rep Of Macedonia"),
    Country("Republic Of Slovenia"),
    Country("Afghanistan"),
    Country("Algeria"),
    Country("Angola"),
    Country("Argentina"),
    Country("Bolivia"),
    Country("Brazil"),
    Country("Kampuchea"),
    Country("Cameroon"),
    Country("Chile"),
    Country("China Peoples Republic"),
    Country("Colombia"),
    Country("Zaire"),
    Country("Costa Rica"),
    Country("Cuba"),
    Country("Dominican Republic"),
    Country("Ecuador"),
    Country("Egypt"),
    Country("El Salvador"),
    Country("Ethiopia"),
    Country("Taiwan"),
    Country("Guatemala"),
    Country("Haiti"),
    Country("Belize"),
    Country("Indonesia"),
    Country("Iran"),
    Country("Iraq"),
    Country("Israel"),
    Country("Cote D'Ivoire"),
    Country("Japan"),
    Country("Lebanon"),
    Country("Liberia"),
    Country("Macau"),
    Country("Malagasy Republic"),
    Country("Mexico"),
    Country("Morocco"),
    Country("Mozambique"),
    Country("Nepal"),
    Country("Antilles (Netherlands)"),
    Country("New Caledonia"),
    Country("Nicaragua"),
    Country("Panama"),
    Country("Paraguay"),
    Country("Peru"),
    Country("Philippines"),
    Country("Puerto Rico"),
    Country("Zimbabwe"),
    Country("Saudi Arabia"),
    Country("Senegal"),
    Country("Somalia"),
    Country("South Korea"),
    Country("Vietnam"),
    Country("Sudan"),
    Country("Syria"),
    Country("Thailand"),
    Country("Togo"),
    Country("Tunisia"),
    Country("Uruguay"),
    Country("USA"),
    Country("Venezuela"),
    Country("Republic Of Yemen"),
    Country("French Overseas Department"),
    Country("Gabon"),
    Country("Laos"),
    Country("Rwanda"),
    Country("Central African Republic"),
    Country("Djibouti"),
    Country("Surinam"),
    Country("Burundi"),
    Country("Honduras"),
    Country("Guinea"),
    Country("Benin"),
    Country("Congo"),
    Country("Chad"),
    Country("Mali"),
    Country("Mauritania"),
    Country("Niger"),
    Country("Czech Republic"),
    Country("Slovak Republic"),
    Country("Tahiti"),
    Country("Tristan Da Cuhna"),
    Country("Burkina Faso"),
    Country("Stateless"),
    Country("Aruba"),
    Country("Bouvet Island"),
    Country("Cocos (Keeling) Islands"),
    Country("Christmas Island"),
    Country("Western Sahara"),
    Country("Eritrea"),
    Country("Micronesia Federation Of"),
    Country("French Guiana"),
    Country("Guadeloupe"),
    Country("South Georgia and South Sandwich Island"),
    Country("Heard Island and Mcdonald Islands"),
    Country("British Indian Ocean Territories"),
    Country("Marshall Islands"),
    Country("Myanmar"),
    Country("Northern Mariana Islands"),
    Country("Martinique"),
    Country("Niue"),
    Country("French Polynesia"),
    Country("Saint Pierre and Miquelon"),
    Country("Pitcairn"),
    Country("Palau"),
    Country("Reunion"),
    Country("Svalbard and Jan Mayen"),
    Country("French Southern Territories"),
    Country("Tokelau"),
    Country("East Timor"),
    Country("United States Minor Outlying Islands"),
    Country("Wallis and Futuna"),
    Country("Mayotte"),
    Country("Democratic Republic Of Congo"),
    Country("Cambodia"),
    Country("Russia"),
    Country("Republic Of Montenegro"),
    Country("Republic Of Serbia"),
    Country("Antarctica"),
    Country("Republic Of Kosovo")
  )

  val excludedCountries = List(
    Country("GREAT BRITAIN"),
    Country("SCOTLAND"),
    Country("ENGLAND"),
    Country("WALES"),
    Country("NORTHERN IRELAND")
  )

}
