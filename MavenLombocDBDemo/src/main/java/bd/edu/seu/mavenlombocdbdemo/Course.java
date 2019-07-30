/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.edu.seu.mavenlombocdbdemo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 *
 * @author Monirujjaman
 */
@Data //all getter,setter,toString;
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of={"code"})
class Course {
    private String code;
    private String title;
}
